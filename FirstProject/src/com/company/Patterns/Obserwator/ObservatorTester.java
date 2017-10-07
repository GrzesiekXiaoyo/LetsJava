package com.company.Patterns.Obserwator;

public class ObservatorTester {

    public static void Test()
    {
        News news = new News();
        Internet internet = new Internet();
        Newspaper newspaper = new Newspaper();
        TV tv = new TV();

        news.CallToObservers("Małgorzata bierze slub!"); //nikt nie nasluchuje

        news.AddObserver(internet);
        news.CallToObservers("Grzegorz bierze slub!"); //internet nasluchuje wiec wyswietli odpowiedni komunikat

        news.AddObserver(newspaper);
        news.AddObserver(tv);
        news.CallToObservers("Ona zabila go!"); //3 zrodla nasluchuja kazdy wyswietli odpowiedni komunikat

        news.RemoveObserver(internet);
        news.RemoveObserver(tv);
        news.RemoveObserver(newspaper);

        news.CallToObservers("Małgorzata bierze slub!"); //znowu nikt tego nie zobaczy:(
    }
}
