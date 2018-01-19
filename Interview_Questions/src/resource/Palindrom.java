package resource;

public class Palindrom {

    public static void main(String[] args) {
	
	String text = "JelenoviPivoNelej";
	
	StringBuilder sb = new StringBuilder();
	
	sb.append(text);
	sb.reverse();
	
	String textReverse = sb.toString();
	
	if (text.equalsIgnoreCase(textReverse)) {
	    System.out.println(text + " is palindrom");
	}
	else {
	    System.out.println(text + " is not palindrom");
	}

    }

}
