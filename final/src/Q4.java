import java.util.Date;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q4 {
    public static void main(String[] args) {
        List<Movie> movieList=new LinkedList<>();
        Date date1 = new GregorianCalendar(1989, Calendar.FEBRUARY, 11).getTime();
        Date date2 = new GregorianCalendar(2000, Calendar.FEBRUARY, 11).getTime();
        Date date3 = new GregorianCalendar(2001, Calendar.FEBRUARY, 11).getTime();
        Date date4 = new GregorianCalendar(1998, Calendar.FEBRUARY, 11).getTime();
        movieList.add(new Movie("GGG",date1,null,null));
        movieList.add(new Movie("KKK",date2,null,null));
        movieList.add(new Movie("XXX",date3,null,null));
        movieList.add(new Movie("PPP",date4,null,null));
        Genre g=new Genre(movieList);
        List<Genre> inputList= new LinkedList<>();
        inputList.add(g);
        Netflix n=new Netflix(inputList);

        addClassic(movieList);
        System.out.println();

        getLastest(movieList);
        System.out.println();
        // date before 2000
        predicate1(movieList);
        System.out.println();
        // date after 1990
        predicate2(movieList);
        System.out.println();
        //date after 1990 before 2000
        predicate3(movieList);
        System.out.println();

        addToAll(movieList);
        System.out.println();



    }

    public static class Movie{
        String title;
        Date date;
        List<String> actors;
        List<String> Director;
        public Movie( String title, Date date, List<String> actors,List<String> Director){
            this.title=title;
            this.date=date;
            this.actors=actors;
            this.Director=Director;

        }
        public void setTitle(String s) {
            this.title=s;
        }
    }

    public static class  Genre{
        List<Movie> movieList;
        public Genre( List<Movie> list){
            this.movieList=list;
        }
    }

    public static class Netflix{
        List<Genre> genreList;
        public Netflix(List<Genre> inputList) {
            this.genreList = inputList;
        }

    }
    //2. add Classic
    public static void addClassic(List<Movie> movieList){
        Date date1 = new GregorianCalendar(2000, Calendar.FEBRUARY, 1).getTime();
        List<Movie> newList=movieList.stream().filter(e -> e.date.before(date1)).flatMap(e->Stream.of(new Movie(e.title + "Classic", e.date, e.actors, e.Director) )).collect(Collectors.toList());
        newList.forEach(e->{
            System.out.println(e.title);
        });

    }
    //3. Get the latest 3 movies released using .limit() method of stream.
    public static List<Movie> getLastest(List<Movie> movieList){
        //sort by decreasing order
        DateComparator(movieList);
        List<Movie> newList = movieList.stream().limit(3).collect(Collectors.toList());
        newList.forEach(e->{
            System.out.println(e.title);
        });
        return newList;
    }
    //4.1  date before 2000
    public static List<Movie> predicate1(List<Movie> movieList){
        Date date1 = new GregorianCalendar(2000, Calendar.FEBRUARY, 1).getTime();
        List<Movie> dateBefore2000=movieList.stream().filter(p-> p.date.before(date1)
        ).collect(Collectors.toList());
        dateBefore2000.forEach(e->{
            System.out.println(e.title);
        });
        return dateBefore2000;
    }

   //4.2 dateAfter1990
    public static List<Movie> predicate2(List<Movie> movieList){
        Date date1 = new GregorianCalendar(1990, Calendar.FEBRUARY, 1).getTime();
        List<Movie> dateAfter1990=movieList.stream().filter(p->p.date.after(date1)).collect(Collectors.toList());
        dateAfter1990.forEach(e->{
            System.out.println(e.title);
        });
        return dateAfter1990;
    }
    //4.3 date between 1990-2000
    public static void predicate3(List<Movie> movieList){
        Date date1 = new GregorianCalendar(1990, Calendar.FEBRUARY, 1).getTime();
        Date date2 = new GregorianCalendar(2000, Calendar.FEBRUARY, 1).getTime();

        List<Movie> newList=movieList.stream()
                .filter(e->e.date.after(date1)&&e.date.before(date2))
                .collect(Collectors.toList());

        newList.forEach(e->{
            System.out.print(e.title);
        });
    }

    //5.1 add release year in the title of the movie  return the title

    public static String addReleaseYear(Movie m){
        m.setTitle(m.title + m.date.toString());
        return m.title;
    }

    //5.2   use this method for all the movies.
    public  static void addToAll(List<Movie> movieList){
         movieList.stream().map(e->addReleaseYear(e));
    }


  //6. Sorting on one of the feature
    static class  SortbyDate implements Comparator<Movie>
    {
        public int compare(Movie a, Movie b)
        {
            return b.date.compareTo(a.date);
        }
    }
    public static List<Movie> DateComparator(List<Movie> movieList){
        Collections.sort(movieList,new SortbyDate() );
        return movieList;
    }
}
