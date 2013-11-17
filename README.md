Synx
====

The whole Syn project (eclipse workspace).
This represents about 10 months of work / research / aknowledgment.
Thank you Ankama for creating such great games.

Bleh.

Setup:
Download this piece of junk and choose it as workspace at eclipse startup.
As far as I remember, all libraries links should be done with vars 
so you just have to change the 'zLIBS' var to wherever you put your libs
Other than that, it should be pretty easy to setup.
You have all the sql databae files needed in Syn/Syn_data, each representing an individual database.

Running Syn:
Make sure the configurations under Syn/config.xml are allright.
Then open the Syn project under the 'Main' Working Set and run Core/Syn.
The projects Synaw and Synod are there only as source projects holders; they contain strategy-specific source code (relative to the game client used)
Syn compiles Synaw & Synod within itself so you don't have to worry about them.




