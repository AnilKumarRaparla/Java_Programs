class Over {
    int id;
    String Name;
    String Branch;
    // Method Overloading
    public void over(String Name, String Branch)
    {
        this.Name = Name;
        this.Branch = Branch;

        System.out.println(Name+" " +Branch);
    }
    public void over(int num, String Name){
        this.id = num;
        this.Name = Name;
        System.out.println(num+ " " +Name);
    }
    public static void main(String[] args)
    {
        Over obj = new Over();
        obj.over("anil","CSE");
        obj.over(501,"Kumar");
    }
}
