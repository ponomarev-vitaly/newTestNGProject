import org.testng.annotations.Test;

public class FirstTestNGClass {
    @Test
    public void openBrowser(){
        System.out.println("Open the browser!");
    }

    @Test
    public void signUp(){
        System.out.println("Signing up...");
    }

    @Test
    public void login(){
        System.out.println("Login...");
    }

    @Test
    public void addToCart(){
        System.out.println("Add to cart...");
    }

    @Test
    public void logOut(){
        System.out.println("Logging out...");
    }

    @Test
    public void closeTheBrowser(){
        System.out.println("Closing the browser...");
    }

}
