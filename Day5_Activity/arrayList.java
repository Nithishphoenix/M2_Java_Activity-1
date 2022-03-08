import java.util.*;
import java.io.*;


class arrayList
{
public static void main(String []args){



List al = new ArrayList();

al.add("Sunrises Hyderabad");
al.add("Delhi capitals");
al.add("Royal Challengers Bangalore");
al.add("Kolkata Knight Riders");
al.add("Mumbai Indians");


System.out.println(al);

Collections.swap(al, 0, 2);

System.out.println(al);



}
}