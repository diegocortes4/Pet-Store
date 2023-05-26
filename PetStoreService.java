import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PetStoreService {
    // a list of pets allow us to store an ordered collection of Strings, which can be retrieved by their index
    // vs, a set a pets, would allow us to store unique values for pets (no duplicates), which do not have indexes, 
    // but are pretty good at retrieving items based off the object themselves
    List<Pet> pets;
    public PetStoreService(){
        // instantiate pets
        pets = new ArrayList<Pet>();
        // a interface may have multiple implementing classes - classes can exhibit the behaviors defined by an interface
    }
    
    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void purchasePet(int id){
        pets.remove(id);
    }

    public void purchasePet(String name){
        // eg if Fido is at index 2, pets.indexOf("Fido") will return 2
        // for every pet, check the pet in 'pets' for if the name of the pet matches 'name'
        // if they match, remove the current pet
        for(int i = 0; i < pets.size(); i++){
            Pet currentPet = pets.get(i);
            String currentPetName = currentPet.name;
            if(currentPetName.equals(name)){
                // if this point is reached, the pet name in 'pets' matches the pet name we're searching for
                // so, remove the pet
                pets.remove(i);
            }
        }
    }

// I want to be able to print my pets, and I can just do that by attempting to print the List Object
    public List<Pet> getPets(){
        return pets;
    }
}