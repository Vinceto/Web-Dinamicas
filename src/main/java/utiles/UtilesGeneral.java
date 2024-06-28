package utiles;

public class UtilesGeneral {
    /**
     * Método que permite obtener el nombre de un mes a partir de su número
     *
     * @param numMes número del mes
     * @return Nombre del Mes
     */
    public String getNombreMes(int numMes) {
        String[] nombresMeses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        // Retorna nombre de Mes
        if (numMes >= 1 && numMes <= 12) {
            return nombresMeses[numMes - 1];
        } else {
            return "Mes inválido";
        }
    }

    /**
     * Método que permite obtener las efemérides de un mes a partir de su numero
     *
     * @param numMes número del mes
     * @return Efemérides del Mes
     */
    public String getEfemeridesMes(int numMes) {
        String[] efemeridesMes = {
                "Efeméride 1 Enero, Efeméride 2 Enero, Efeméride 3 Enero",
                "Efeméride 1 Febrero, Efeméride 2 Febrero",
                "Efeméride 1 Marzo, Efeméride 2 Marzo",
                "Abril - Sin Efemérides",
                "Efeméride 1 Mayo",
                "Efeméride 1 Junio, Efeméride 2 Junio",
                "Efeméride 1 Julio, Efeméride 2 Julio",
                "Agosto - Sin Efemérides",
                "Efeméride 1 Septiembre, Efeméride 2 Septiembre, Efeméride 3 Septiembre",
                "Octubre - Sin Efemérides",
                "Efeméride 1 Noviembre, Efeméride 2 Noviembre",
                "Efeméride 1 Diciembre"
        };
        // Retorna efemérides del Mes
        if (numMes >= 1 && numMes <= 12) {
            return efemeridesMes[numMes - 1];
        } else {
            return "Mes inválido";
        }
    }

    /**
     * Método que permite obtener la cantidad de días de un mes a partir de su número
     *
     * @param numMes número del mes
     * @return cantidad de días del mes
     */
    public int getDiasMes(int numMes) {
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (numMes >= 1 && numMes <= 12) {
            return diasMes[numMes - 1];
        } else {
            return -1; // Mes inválido
        }
    }

    /**
     * Método que permite obtener la cantidad de días feriados de un mes a partir de su número
     *
     * @param numMes número del mes
     * @return cantidad de días feriados del mes
     */
    public int getCantidadFeriadosMes(int numMes) {
        int[] feriadosMes = {3, 2, 2, 0, 1, 2, 2, 0, 3, 0, 2, 1};
        if (numMes >= 1 && numMes <= 12) {
            return feriadosMes[numMes - 1];
        } else {
            return -1; // Mes inválido
        }
    }
}