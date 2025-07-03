package Draft;

public class CustomerSimple {
    private int id ;
    private String name ;
    private String email;
    private String score ;
     public CustomerSimple(int id , String name , String email , String score ){



         this.id = id ;
         this.name = name;
         this.email = email;
         this.score = score;
     }

    private boolean validateId(int id) {
        if (id < 1) {
            return false;
        }
        return true;
    }

    private boolean validateName(String name) {
        // check optional constraint
        if (name == null || name.length() == 0) {
            return false;
        }

        // check length constraint
        if (name.length() > 30) {
            return false;
        }

        return true;
    }
}