package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void Verificar_A_sea_igual_a_B(){

        //Given
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);
        int a=1,b=1;
        String c="MIKE";

        //When
        algoritmoX.algoritmoACubrir(a, b, c);

        //Then
        Mockito.verify(dependencia1).save(c);
        Mockito.verify(dependencia3).recover();
    }
    @Test
    public void Verificar_A_sea_menor_que_B(){

        //Given
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);
        int a=1,b=3;
        String c="MIKE";

        //When

        algoritmoX.algoritmoACubrir(a, b, c);

        //Then
        Mockito.verify(dependencia2).print(a,c);
        Mockito.verify(dependencia3).recover();
    }

    @Test
    public void Verificar_A_sea_mayor_que_B(){

        //Given
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1,dependencia2,dependencia3);
        int a=3,b=1;
        String c="MIKE";

        //When

        algoritmoX.algoritmoACubrir(a, b, c);

        //Then
        Mockito.verify(dependencia3).send(a,b);
        Mockito.verify(dependencia3).recover();
    }


}
