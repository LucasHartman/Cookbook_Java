Easy mistakes:
- When running commands in the command-line alway be in the Project directory:  C:\Users\12213119\Desktop\mods
- When compiling or executing in the command-line, make sure when to use / or . 
- When creating a directory or Module name, don't use digits like mod1 or mod2
- The folder for the .jar file must be create mannualy
- The folder for the .jar file must have the same name as the project name


-p specify the project name
-d specify the directory
-m specify the module 


Compile modA:

	javac -p mods -d modA modA/packs/root/female/*.java modA/module-info.java

Run modA file:

	java -p modA -m packs.root.female/packs.root.female.TaskA

Create Jar modA;

	jar -cvf mods/packs.root.female.jar -C modA/ .

