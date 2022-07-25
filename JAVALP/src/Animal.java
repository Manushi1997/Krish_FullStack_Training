import java.io.*;
class Persist{
    public static <Student> void main(String args[]){
        try{
            //Creating the object
            Student s1= new Student(211,"ravi");
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //Closing the stream
            out.close();
            System.out.println("Completed");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
