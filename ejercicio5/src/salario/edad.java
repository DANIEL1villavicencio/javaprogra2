package salario;

import static java.lang.Math.round;

public class edad {
    int diasi,diasact,diatotal,anototal,mestotal;
    int diah= 30;
    int mesh = 4;
    int anioh = 2024;
    public edad (int dia, int mes, int ano) {
        diasi=dia+(mes*30)+(ano*12*30);
        diasact=diah+(mesh*30)+(anioh*12*30);
        diatotal= diasact-diasi;
        anototal= round(diatotal/365);
        mestotal= round((diatotal-(anototal*365))/30);
        diatotal=diatotal -(mes*30)-(anototal*365);
    }
}
