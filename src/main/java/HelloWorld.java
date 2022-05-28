import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
	String[] names={"skywalker","yoda","Obi-Wan","Kenobi", "Qui-Gon","Jinn"};
        System.out.println("Hi, whats your name?");//are you a jedi?
	Scanner input = new Scanner(System.in);
        String myString = input.next();
	for(String name :names){
		if(myString.contains(name)){
			System.out.println("                    ____\n"
					+"                 _.' :  `._\n"
					+"             .-.'`.  ;   .'`.-.\n"
					+"    __      / : ___\\ ;  /___ ; \\      __\n"
					+"  ,'_ \"\"--.:__;\".-.\";: :\".-.\":__;.--\"\" _`,\n"
					+"  :' `.t\"\"--.. '<@.`;_  ',@>` ..--\"\"j.' `;\n"
					+"       `:-.._J '-.-'L__ `-- ' L_..-;'\n"
					+"         \"-.__ ;  .-\"  \"-.  : __.-\"\n"
					+"             L ' /.------.\\ ' J\n"
					+"              \"-.   \"--\"   .-\"\n"
					+"             __.l\"-:_JL_;-\";.__\n"
					+"          .-j/'.;  ;\"\"\"\"  / .'\\\"-.\n"
					+"        .' /:`. \"-.:     .-\" .';  `.\n"
					+"     .-\"  / ;  \"-. \"-..-\" .-\"  :    \"-.\n"
					+"  .+\"-.  : :      \"-.__.-\"      ;-._   \\\n"
					+"  ; \\  `.; ;                    : : \"+. ;\n"
					+"  :  ;   ; ;                    : ;  : \\:\n"
					+" : `.\"-; ;  ;                  :  ;   ,/;\n"
					+"  ;    -: ;  :                ;  : .-\"'  :\n"
					+"  :\\     \\  : ;             : \\.-\"      :\n"
					+"   ;`.    \\  ; :            ;.'_..--  / ;\n"
					+"   :  \"-.  \"-:  ;          :/.\"      .'  :\n"
					+"     \\       .-`.\\        /t-\"\"  \":-+.   :\n"
					+"      `.  .-\"    `l    __/ /`. :  ; ; \\  ;\n"
					+"        \\   .-\" .-\"-.-\"  .' .'j \\  /   ;/\n"
					+"         \\ / .-\"   /.     .'.' ;_:'    ;\n"
					+"          :-\"\"-.`./-.'     /    `.___.'\n"
					+"                \\ `t  ._  /\n"
					+"                 \"-.t-._:'\n"
					+"          May the Force be with you!\n"
					
					);
			return;
		}
	}
	System.out.println("Hello " +myString);
	
    }
}
