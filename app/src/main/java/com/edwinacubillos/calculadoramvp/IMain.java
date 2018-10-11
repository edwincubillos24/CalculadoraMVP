package com.edwinacubillos.calculadoramvp;

interface IMain {

    interface view {
        void mostrarResultado(int total);

        void mostrarError(String error);
    }

    interface presenter {

        void sumar(String num1, String num2); //interactor

        void mostrarError(String error); //View

        void mostrarResultado(int total); //View

    }

    interface interactor {
        void sumar (String num1, String num2);
    }
}
