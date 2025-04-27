
public class AlvinWu{

    String firstName = "Alvin";
    String lastName = "Wu";
    String UCIid = "alvinyw1";
    int UCInum = 82929511;

    String getFullName(){
        return firstName + " " + lastName;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    String getUCInetID(){
        return UCIid;
    }
    int getStudentNumber(){
        return UCInum;
    }
    String getRotatedFullName(int shift){
        int len = getFullName().length();
        if (shift < 0) { //in case of negatives
            shift = len + shift;
        }
        String left = getFullName().substring(0, shift);
        String right = getFullName().substring(shift);
        return right + left;
    }




    
}