package main;

import controller.CalcController;
import model.CalcModel;
import view.CalcView;

/**
 *
 * @author fritzen.alisson
 */
public class main
{
    public static void main(String[] args)
    {
        CalcView view = new CalcView();
        CalcModel model = new CalcModel();
        CalcController controller = new CalcController(view, model);
        
        view.setVisible(true);
    }
}
