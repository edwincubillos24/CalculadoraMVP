package com.edwinacubillos.calculadoramvp;

public class MainInteractor implements IMain.interactor {

    private IMain.presenter presenter;

    public MainInteractor(IMain.presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String num1, String num2) {
        if (num1.equals("") || num2.equals("")){
            presenter.mostrarError("Debe digitar los dos numeros");
        } else {
            presenter.mostrarResultado(Integer.valueOf(num1)+Integer.valueOf(num2));
        }
    }
}
