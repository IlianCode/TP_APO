package menagerie;

// TODO Question 5: Créez la classe Chat...
// 

public class Chat extends Mammifere {
    public Chat(String nom) {
        super(nom);
    }
    
    @Override
    public String cri() {
        return "Miaou !";
    }
}