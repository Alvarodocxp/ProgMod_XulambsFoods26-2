import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PizzaTest {

    @Test
    public void adicionaIngredientesCorretamente(){
        //Arrange
        Pizza pizza = new Pizza();

        //Act
        int quantos = 
            pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(4, quantos);
    }

        @Test
    public void NaoadicionaIngredientesCorretamente(){
        //Arrange
        Pizza pizza = new Pizza();

        //Act
        int quantos = 
            pizza.adicionarIngredientes(-4);

        //Assert
        assertEquals(0, quantos);
    }

            @Test
    public void NaoAcumulaIngredientesEmExcesso(){
        //Arrange
        Pizza pizza = new Pizza();
        pizza.adicionarIngredientes(4);
        //Act
        int quantos = 
            pizza.adicionarIngredientes(5);

        //Assert
        assertEquals(4, quantos);
    }
    
}
