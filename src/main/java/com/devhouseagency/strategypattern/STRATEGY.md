# SimUDuck App
Joe works for a company that makes a highly successful duck pond simulation game, SimUDuck.  
The game can show a large variety of duck species swimming and making quacking sounds. The   
initial designers of the system used standard OO techniques and created one Duck superclass  
from which all other duck types inherit.

## Improvements
The company needs to update the currently existing software, need to add more functionality.  
The new feature that they want to add is a flying behavior for all that ducks in the simulator.

### Overriding Methods
1. Override quack and fly to make the RubberDuck not fly or quack.  

There are cases where inheritance isn't a great choice for code reuse. Maintenance issues may  
occur in the future.

