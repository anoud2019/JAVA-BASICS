import Entities.*;
import Services.*;

import java.util.Scanner;

public class CalculatorSystemDriver {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        menuService.displayMenu();
    }
}
