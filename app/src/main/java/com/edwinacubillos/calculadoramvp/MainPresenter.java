package com.edwinacubillos.calculadoramvp;

public class MainPresenter implements IMain.presenter {

    private IMain.view activityView;
    private IMain.interactor interactor;

    public MainPresenter(IMain.view activityView) {
        this.activityView = activityView;
        interactor = new MainInteractor(this);
    }

    @Override
    public void sumar(String num1, String num2) {
        interactor.sumar(num1, num2);
    }

    @Override
    public void mostrarError(String error) {
        activityView.mostrarError(error);
        }

    @Override
    public void mostrarResultado(int total) {
        activityView.mostrarResultado(total);
    }
}
