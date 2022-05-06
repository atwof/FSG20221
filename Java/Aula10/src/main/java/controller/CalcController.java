package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CalcModel;
import view.CalcView;

/**
 *
 * @author fritzen.alisson
 */
public class CalcController
{
    private CalcView view;
    private CalcModel model;
    
    public CalcController(CalcView view, CalcModel model)
    {
        this.view = view;
        this.model = model;
        
        this.view.getBtnAdd().addActionListener(new CalcListener());
    }
    
    class CalcListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String opc = view.getCombo().getSelectedItem().toString();
            if(view.getTxtNum1().getText().isBlank() || view.getTxtNum2().getText().isBlank())
            {
                view.setLblResultado("Digite valores válidos");
                view.setTextNum1(null);
                view.setTextNum2(null);;
            }
            else
            {
                try
                {
                    int num1 = Integer.parseInt(view.getTxtNum1().getText());
                    int num2 = Integer.parseInt(view.getTxtNum2().getText());
              
                    switch(opc)
                    {
                        case "Dividir":
                            model.dividir(num1, num2);
                            break;
                        case "Somar":
                            model.somar(num1, num2);
                            break;
                        case "Multiplicar":
                            model.multiplicar(num1, num2);
                            break;
                        case "Subtrair":
                            model.subtrair(num1, num2);
                            break;
                    }

                    view.setLblResultado("O resultado é " + Integer.toString(model.getResultado()));
                }
                catch(Exception ex)
                {
                   view.setLblResultado("Digite valores válidos");
                   view.setTextNum1(null);
                   view.setTextNum2(null);
                   view.setFocusNum1();
                }
            }
        }
    }
}
