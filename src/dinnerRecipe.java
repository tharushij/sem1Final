import java.util.Scanner;

public class dinnerRecipe implements Comparable<dinnerRecipe>
{
    //instance variables
    private String recipeName, majorIng;
    private int prepTime, cookTime;
    private static int count = 0;

    //0-arg constructor
    public dinnerRecipe()
    {
        this.recipeName = recipeName;
        this.majorIng = majorIng;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        count++;
    }

    //full constructor
    public dinnerRecipe(String newRecipeName, String newMajorIng, int newPrepTime, int newCookTime)
    {
        recipeName = newRecipeName;
        majorIng = newMajorIng;
        prepTime = newPrepTime;
        cookTime = newCookTime;
        count++;
    }


    //setters
    public void setRecipeName(String newRecipeName)
    {
        recipeName = newRecipeName;
    } //end name setter

    public void setMajorIng(String newMajorIng)
    {
        majorIng = newMajorIng;
    } //end ingredients setter

    public void setPrepTime(int newPrepTime)
    {
        prepTime = newPrepTime;
    } //end time setter

    public void setCookTime(int newCookTime)
    {
        cookTime = newCookTime;
    } //end time setter

    //getters
    public String getName()
    {
        return recipeName;
    }

    public String getMajorIng()
    {
        return getMajorIng();
    }

    public int getPrepTime()
    {
        return prepTime;
    }

    public int getCookTime()
    {
        return cookTime;
    }


    //brain method(s)
    //a. uses scanner to pass user input into the recipe information
    public String addInfo()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the name of the recipe?");
        recipeName = keyboard.nextLine();

        System.out.println("What is the prep time?");
        prepTime = keyboard.nextInt();

        String out = "";
        out += "Name: " + recipeName;
        out += "\nPrep Time: " + prepTime;
        return out;
    } //end method addInfo

    //b. compares prep times of recipes and returns the comparison
    public String dispPrepTime()
    {
        for(int i = 0; i < count; i++)
        {
            if(prepTime >= 30)
            {
                return "long preptime";
            } //end if
            else if(prepTime >= 5 && prepTime <= 15)
            {
                return "moderate preptime";
            } //end else if
            else
            {
                return "short preptime";
            } //end else
        }
        return null;
    } //end method dispPrepTime

    //c. makes use of Comparable interface in order to compare prep times of recipes
    @Override
    public int compareTo(dinnerRecipe someRecipe)
    {
        if(this.prepTime < someRecipe.prepTime)
        {
            return -1;
        } //end if
        else if(this.prepTime == someRecipe.prepTime)
        {
            return 0;
        } //end else if
        else
        {
            return 1;
        } //end else
    } //end method compareTo

    //d. checks if someone could be allergic to the ingredients (common allergies)
    public String checkAllergy()
    {
        for(int i = 0; i < count; i++)
        {
            if(majorIng.equalsIgnoreCase("eggs") ||
                    majorIng.equalsIgnoreCase("peanuts") ||
                    majorIng.equalsIgnoreCase("fish"))
            {
                return "ALLERGY WARNING";
            } //end if
            return "recipe has no allergy warning";
        } //end for
        return "";
    } //end method checkAllergy
} //end class dinnerRecipe
