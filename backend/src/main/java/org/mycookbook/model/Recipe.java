package org.mycookbook.model;

import java.util.List;

public class Recipe {

    private Long id;
    private String title;
    private Category category;
    private List<Ingredient> ingredients;
    private String preparation;
    private Integer nrOfPersons;
    private Integer preparationTime; //In minutes
    private Integer cookingTime; //In minutes

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public Integer getNrOfPersons() {
        return nrOfPersons;
    }

    public void setNrOfPersons(Integer nrOfPersons) {
        this.nrOfPersons = nrOfPersons;
    }

    public Integer getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Integer preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Integer getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(Integer cookingTime) {
        this.cookingTime = cookingTime;
    }
}
