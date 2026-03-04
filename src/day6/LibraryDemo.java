package day6;
class GC extends Exception {
    GC(String message) {
        super(message);
    }
}
public class LibraryDemo {
    static void CheckAttendence(boolean absent)throws GC{
        if(absent){
            throw new GC("penalty to submit 5 books in library");
        }
        else{
            System.out.println("Good students");
        }
    }
    public static void main(String[] args) {
        try{
            CheckAttendence(true);
        }
        catch(GC e){
            System.out.println("caught an exception"+e.getMessage());
        }
        finally{
            System.out.println("welcome to sapthagiri friends: chai peelo");
        }
    }
}
