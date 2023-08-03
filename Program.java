package code;
import code.Controller.PetController;
import code.Model.Pet;
import code.Services.IRepository;
import code.Services.PetRepository;
import code.UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu (controller).start();
    }
}    