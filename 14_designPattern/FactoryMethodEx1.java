
/*
--  FactoryMethod
-   Define an interface or abstract class
-   let the subclasses decide which class to instantiate. 
-   Factory Method Pattern allows the sub-classes to choose the type of objects to create.
-   


                                Blacksmith
                                    |
                        -------------------------
                        \                        |
                    ElfBlacksmith           OrcBlacksmith
                                                |
                                            sub class (desided on OrcBlacksmith)

*/

// Define an interface for creating an object
interface Blacksmith {
    Weapon manufactureWeapon(WeaponType weaponType);
  }


// CHOISE 1
class ElfBlacksmith implements Blacksmith {
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ELFARSENAL.get(weaponType);
    }
  }
  
// CHOISE 2
class OrcBlacksmith implements Blacksmith {
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ORCARSENAL.get(weaponType);
    }
  }
