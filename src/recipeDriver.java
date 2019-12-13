public class recipeDriver
{
    public static void main(String[]args)
    {
        breakfastRecipe recipe1 = new breakfastRecipe();
        breakfastRecipe recipe2 = recipe1.getRecipe();

        //user input passed to add info
        recipe1.addInfo();
        recipe2.addInfo();

        //establishes whether there's an allergy possibility
        System.out.println(recipe1.checkAllergy() + " for the " + recipe1.getName() + " recipe.");
        System.out.println(recipe2.checkAllergy() + " for the " + recipe2.getName() + " recipe.");

        //display the prep times before comparing them
        System.out.println(recipe1.getName() + " prep time: " + recipe1.getPrepTime() + " minutes.");
        System.out.println(recipe2.getName() + " prep time: " + recipe2.getPrepTime() + " minutes.");

        //compare the preparation times
        int comp1 = recipe1.compareTo(recipe2);
        if(comp1 == 1)
        {
            System.out.println(recipe1.getName() + " takes longer to prepare than " + recipe2.getName() + ".");
        } //end if
        else if(comp1 == 0)
        {
            System.out.println("They take the same amount of time to make");
        } //end else if
        else
        {
            System.out.println(recipe1.getName() + " takes less time to prep than " + recipe2.getName());
        } //end else
    } //end method main
} //end class recipeDriver
