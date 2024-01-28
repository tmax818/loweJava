import java.util.Scanner;public class AVErrorDecoder2{    static Scanner sc = new Scanner(System.in);    public static void main(String[] args)    {        System.out.println            ("Welcome to the Autonomous Vehicle "            + "error code decoder.\n\n"            + "If your Autonomous Vehicle generates "            + "an error code,\n"            + "you can use this program to determine "            + "the exact\ncause of the error.\n");        System.out.print("Enter the error code: ");        int err = sc.nextInt();        String msg = "";
        switch (err)
        {			case 1:            	msg = "General error.\n"
            	    + "Returning control to driver.";
            	break;
        	case 2:
            	msg = "System Update Required.\n"
                	+ "Pulling over and advising occupant "
	                + "to not restart vehicle.";
            	break;
			case 3:	            msg = "Vehicle bored with destination.\n"	                + "Changing to something more exotic.";            	break;
			case 4:
	            msg = "Too many Drive Thru Windows.\n"	                + "Taking occupant to nearest health clinic.";            	break;
			case 5:
	            msg = "Dodgers game detected on audio system.\n"	                + "Switching to Giants.";            	break;
			case 6:
	            msg = "Left turn signal stuck on for more than 10 miles.\n"	                + "Vehicle may be too old to drive self.";            	break;
			case 7:
	            msg = "Vehicle has had enough and cannot take it anymore.\n"	                + "Heading for nearest bridge.";            	break;
			default:
	            msg = "I'm sorry, Dave. I'm afraid I can't do that.\n";		}
        System.out.println(msg);    }}
