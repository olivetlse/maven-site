package com.developpez;

/**
 * Un test pour l'article Maven.
 * 
 * @author Baptiste Wicht
 */
public class ArticleMavenTest {
    /**
     * Teste la méthode getDescription().
     */
    @Test
    public void testGetDescription() {
        assertEquals(ArticleMaven.getDescription(), "Je suis un article de Developpez");
    }
}