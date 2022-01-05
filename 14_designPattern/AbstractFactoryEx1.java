
/*
--  AbstractFactoryEx1
-   Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

                    Castle              King            Army 
                    |                   |               |
                    ------------------------------------
                                        |
                                    KingdomFactory (families of related objects)
                                        |
                    -----------------------------------
                    |                                  |
            ElfKingdomFactory                  OrcKingdomFactory 

*/

interface Castle {
    String getDescription();
  }
  
interface King {
    String getDescription();
  }
  
interface Army {
    String getDescription();
  }



interface KingdomFactory implements Castle,King,Army {
    Castle createCastle();
    King createKing();
    Army createArmy();
  }



  public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
      return new ElfCastle();
    }
  
    @Override
    public King createKing() {
      return new ElfKing();
    }
  
    @Override
    public Army createArmy() {
      return new ElfArmy();
    }
  }