/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradesortjunit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Cristina
 */
public class GradeSortJunit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<String, Integer> studentGrades = new HashMap<>();
        
        studentGrades.put("sally", 97);
        studentGrades.put("becky", 60);
        studentGrades.put("mary", 80);
        studentGrades.put("marc", 100);
        studentGrades.put("bob", 80);
        
        
        
        System.out.println("Normal list");
        System.out.println(studentGrades);
        
        //test expected names
        Map<String, Integer> expected = new HashMap<>();
        
        expected.put("becky", 60);
        expected.put("bob", 80);
        expected.put("marc", 100);
        expected.put("mary", 80);
         expected.put("sally", 97);
        
        //1. Test if equal but ignore order
        assert (studentGrades.equals(expected));
         boolean studentinlist5 = studentGrades.equals(expected);
        System.out.println("Are they the same names :" +studentinlist5);
        
       //sorted by name
       System.out.println("Here is the sorted list by names");
        Map<String, Integer> sortStudents = new TreeMap<String, Integer>(studentGrades);
        
        Set sort_Students = sortStudents.entrySet();
        Iterator i = sort_Students.iterator();
         while (i.hasNext()) {
             Map.Entry grade = (Map.Entry)i.next();
             System.out.println(grade.getKey() + " " + grade.getValue());
            
         }
         
         //test if sorted
        boolean studentinlist8 = sortStudents.equals(expected);
        System.out.println("Are they sorted the same :" +studentinlist8);
           
    }
    
    
    
}
