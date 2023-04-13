package oop5;

public class Adressbook {
    import java.util.ArrayList;

public class Adressbook {
    ArrayList<Phonebook> pb=new ArrayList();
    
    public void Adressbook(){
        pb.add(new Phonebook("Буздин Владислав Александрович","+79511111111","Москва"));        
        pb.add(new Phonebook("Буздина Анастасия Юрьевна","+79522222222","Москва"));        
    }

    public void showAddressBook(){
        for(Phonebook i:pb){
            System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
        }
    }
}
}
