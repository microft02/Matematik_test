package com.example.matematik_test;

public class Savollar {

    public String mSavollar[] = {
            "Минута без времени?",
            "Что лишнее: сантиметр, килограмм, миллиметр, дециметр?",
            "Самая «маленькая» геометрическая фигура?",
            "Чему равна шестая часть суток?",
            "Сколько секунд в одном часе?",
            "У родителей пять сыновей. Каждый имеет одну сестру. Сколько всего детей в семье?",
            "Что есть у каждого растения, слова и уравнения?",
            "Без чего не обходятся математики, барабанщики, охотники:",
            "Мышь считает дырки в сыре: три плюс две – всего…",
            "Единица с шестью нулями:"
    };
    private String mChoices[][] = {
            {"1час 00 минут", "0 часов 00 минут", "0 часов 1 минута", "5 часов 1 минута"},
            {"Сантиметр", "Килограмм", "Миллиметр", "Дециметр"},
            {"Прямая", "Луч", "Точка", "Отрезок"},
            {"4 часа", "6 часов", "8 часов", "10 часов"},
            {"60", "120", "360", "3600"},
            {"6", "8", "10", "11"},
            {"Приставка", "Корень", "Суффикс", "Окончание"},
            {"Барабана", "Ружья", "Дроби", "Уравнений"},
            {"4", "5", "6", "7"},
            {"Миллион", "Миллиард", "Сто тысяч", "пять тысяч"},
    };

    private String mCorrectAnswers[] = {"0 часов 00 минут", "Килограмм", "Точка", "4 часа", "3600", "6", "Корень", "Дроби", "5", "Миллион"};

    public String getQuestion(int a) {
        String question = mSavollar[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
};
