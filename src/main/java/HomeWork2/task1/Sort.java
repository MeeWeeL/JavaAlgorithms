package HomeWork2.task1;

public class Sort {
    static int[] Lenuvo;
    static int[] Asos;
    static int[] MacNote;
    static int[] Eser;
    static int[] Xamiou;
    static int LenuvoCounter;
    static int AsosCounter;
    static int MacNoteCounter;
    static int EserCounter;
    static int XamiouCounter;
    public static Notebook[] sortByBrand(Notebook[] array) {

        Notebook[] newArray = new Notebook[array.length];

        Lenuvo = new int[array.length];
        Asos = new int[array.length];
        MacNote = new int[array.length];
        Eser = new int[array.length];
        Xamiou = new int[array.length];
        LenuvoCounter = 0;
        AsosCounter = 0;
        MacNoteCounter = 0;
        EserCounter = 0;
        XamiouCounter = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i].brand) {
                case "Lenuvo":
                    Lenuvo[LenuvoCounter] = i;
                    LenuvoCounter++;
                    break;
                case "Asos":
                    Asos[AsosCounter] = i;
                    AsosCounter++;
                    break;
                case "MacNote":
                    MacNote[MacNoteCounter] = i;
                    MacNoteCounter++;
                    break;
                case "Eser":
                    Eser[EserCounter] = i;
                    EserCounter++;
                    break;
                default:
                    Xamiou[XamiouCounter] = i;
                    XamiouCounter++;
            }
        }

        int counter = 0;

        for (int i = 0; i < LenuvoCounter; i++) {
            newArray[i] = array[Lenuvo[i]];
        }
        counter = LenuvoCounter;
        for (int i = 0; i < AsosCounter; i++) {
            newArray[i + counter] = array[Asos[i]];
        }
        counter += AsosCounter;
        for (int i = 0; i < MacNoteCounter; i++) {
            newArray[i + counter] = array[MacNote[i]];
        }
        counter += MacNoteCounter;
        for (int i = 0; i < EserCounter; i++) {
            newArray[i + counter] = array[Eser[i]];
        }
        counter += EserCounter;
        for (int i = 0; i < XamiouCounter; i++) {
            newArray[i + counter] = array[Xamiou[i]];
        }

        return newArray;
    }
    public static Notebook[] sortByRAM(Notebook[] array) {

        Notebook[] newArray = new Notebook[array.length];

        int[] RAM4 = new int[array.length];
        int[] RAM8 = new int[array.length];
        int[] RAM12 = new int[array.length];
        int[] RAM16 = new int[array.length];
        int[] RAM20 = new int[array.length];
        int[] RAM24 = new int[array.length];
        int RAM4Counter = 0;
        int RAM8Counter = 0;
        int RAM12Counter = 0;
        int RAM16Counter = 0;
        int RAM20Counter = 0;
        int RAM24Counter = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i].ram) {
                case 4:
                    RAM4[RAM4Counter] = i;
                    RAM4Counter++;
                    break;
                case 8:
                    RAM8[RAM8Counter] = i;
                    RAM8Counter++;
                    break;
                case 12:
                    RAM12[RAM12Counter] = i;
                    RAM12Counter++;
                    break;
                case 16:
                    RAM16[RAM16Counter] = i;
                    RAM16Counter++;
                    break;
                case 20:
                    RAM20[RAM20Counter] = i;
                    RAM20Counter++;
                    break;
                default:
                    RAM24[RAM24Counter] = i;
                    RAM24Counter++;
            }
        }

        int counter = 0;

        for (int i = 0; i < RAM24Counter; i++) {
            newArray[i] = array[RAM24[i]];
        }
        counter = RAM24Counter;
        for (int i = 0; i < RAM20Counter; i++) {
            newArray[i + counter] = array[RAM20[i]];
        }
        counter += RAM20Counter;
        for (int i = 0; i < RAM16Counter; i++) {
            newArray[i + counter] = array[RAM16[i]];
        }
        counter += RAM16Counter;
        for (int i = 0; i < RAM12Counter; i++) {
            newArray[i + counter] = array[RAM12[i]];
        }
        counter += RAM12Counter;
        for (int i = 0; i < RAM8Counter; i++) {
            newArray[i + counter] = array[RAM8[i]];
        }
        counter += RAM8Counter;
        for (int i = 0; i < RAM4Counter; i++) {
            newArray[i + counter] = array[RAM4[i]];
        }

        return newArray;
    }
    public static Notebook[] sortByCost(Notebook[] array) {

        Notebook[] newArray = new Notebook[array.length];
// Да, много памяти, но в погоне за скоростью, например серверу интернет-магазина, самое то мне кажется
        int[] cost500 = new int[array.length];
        int[] cost550 = new int[array.length];
        int[] cost600 = new int[array.length];
        int[] cost650 = new int[array.length];
        int[] cost700 = new int[array.length];
        int[] cost750 = new int[array.length];
        int[] cost800 = new int[array.length];
        int[] cost850 = new int[array.length];
        int[] cost900 = new int[array.length];
        int[] cost950 = new int[array.length];
        int[] cost1000 = new int[array.length];
        int[] cost1050 = new int[array.length];
        int[] cost1100 = new int[array.length];
        int[] cost1150 = new int[array.length];
        int[] cost1200 = new int[array.length];
        int[] cost1250 = new int[array.length];
        int[] cost1300 = new int[array.length];
        int[] cost1350 = new int[array.length];
        int[] cost1400 = new int[array.length];
        int[] cost1450 = new int[array.length];
        int[] cost1500 = new int[array.length];
        int[] cost1550 = new int[array.length];
        int[] cost1600 = new int[array.length];
        int[] cost1650 = new int[array.length];
        int[] cost1700 = new int[array.length];
        int[] cost1750 = new int[array.length];
        int[] cost1800 = new int[array.length];
        int[] cost1850 = new int[array.length];
        int[] cost1900 = new int[array.length];
        int[] cost1950 = new int[array.length];
        int[] cost2000 = new int[array.length];
        int cost500Counter = 0;
        int cost550Counter = 0;
        int cost600Counter = 0;
        int cost650Counter = 0;
        int cost700Counter = 0;
        int cost750Counter = 0;
        int cost800Counter = 0;
        int cost850Counter = 0;
        int cost900Counter = 0;
        int cost950Counter = 0;
        int cost1000Counter = 0;
        int cost1050Counter = 0;
        int cost1100Counter = 0;
        int cost1150Counter = 0;
        int cost1200Counter = 0;
        int cost1250Counter = 0;
        int cost1300Counter = 0;
        int cost1350Counter = 0;
        int cost1400Counter = 0;
        int cost1450Counter = 0;
        int cost1500Counter = 0;
        int cost1550Counter = 0;
        int cost1600Counter = 0;
        int cost1650Counter = 0;
        int cost1700Counter = 0;
        int cost1750Counter = 0;
        int cost1800Counter = 0;
        int cost1850Counter = 0;
        int cost1900Counter = 0;
        int cost1950Counter = 0;
        int cost2000Counter = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i].cost) {
                case 500:
                    cost500[cost500Counter] = i;
                    cost500Counter++;
                    break;
                case 550:
                    cost550[cost550Counter] = i;
                    cost550Counter++;
                    break;
                case 600:
                    cost600[cost600Counter] = i;
                    cost600Counter++;
                    break;
                case 650:
                    cost650[cost650Counter] = i;
                    cost650Counter++;
                    break;
                case 700:
                    cost700[cost700Counter] = i;
                    cost700Counter++;
                    break;
                case 750:
                    cost750[cost750Counter] = i;
                    cost750Counter++;
                    break;
                case 800:
                    cost800[cost800Counter] = i;
                    cost800Counter++;
                    break;
                case 850:
                    cost850[cost850Counter] = i;
                    cost850Counter++;
                    break;
                case 900:
                    cost900[cost900Counter] = i;
                    cost900Counter++;
                    break;
                case 950:
                    cost950[cost950Counter] = i;
                    cost950Counter++;
                    break;
                case 1000:
                    cost1000[cost1000Counter] = i;
                    cost1000Counter++;
                    break;
                case 1050:
                    cost1050[cost1050Counter] = i;
                    cost1050Counter++;
                    break;
                case 1100:
                    cost1100[cost1100Counter] = i;
                    cost1100Counter++;
                    break;
                case 1150:
                    cost1150[cost1150Counter] = i;
                    cost1150Counter++;
                    break;
                case 1200:
                    cost1200[cost1200Counter] = i;
                    cost1200Counter++;
                    break;
                case 1250:
                    cost1250[cost1250Counter] = i;
                    cost1250Counter++;
                    break;
                case 1300:
                    cost1300[cost1300Counter] = i;
                    cost1300Counter++;
                    break;
                case 1350:
                    cost1350[cost1350Counter] = i;
                    cost1350Counter++;
                    break;
                case 1400:
                    cost1400[cost1400Counter] = i;
                    cost1400Counter++;
                    break;
                case 1450:
                    cost1450[cost1450Counter] = i;
                    cost1450Counter++;
                    break;
                case 1500:
                    cost1500[cost1500Counter] = i;
                    cost1500Counter++;
                    break;
                case 1550:
                    cost1550[cost1550Counter] = i;
                    cost1550Counter++;
                    break;
                case 1600:
                    cost1600[cost1600Counter] = i;
                    cost1600Counter++;
                    break;
                case 1650:
                    cost1650[cost1650Counter] = i;
                    cost1650Counter++;
                    break;
                case 1700:
                    cost1700[cost1700Counter] = i;
                    cost1700Counter++;
                    break;
                case 1750:
                    cost1750[cost1750Counter] = i;
                    cost1750Counter++;
                    break;
                case 1800:
                    cost1800[cost1800Counter] = i;
                    cost1800Counter++;
                    break;
                case 1850:
                    cost1850[cost1850Counter] = i;
                    cost1850Counter++;
                    break;
                case 1900:
                    cost1900[cost1900Counter] = i;
                    cost1900Counter++;
                    break;
                case 1950:
                    cost1950[cost1950Counter] = i;
                    cost1950Counter++;
                    break;
                default:
                    cost2000[cost2000Counter] = i;
                    cost2000Counter++;
            }
        }

        int counter = 0;

        for (int i = 0; i < cost500Counter; i++) {
            newArray[i] = array[cost500[i]];
        }
        counter += cost500Counter;
        for (int i = 0; i < cost550Counter; i++) {
            newArray[i + counter] = array[cost550[i]];
        }
        counter += cost550Counter;
        for (int i = 0; i < cost600Counter; i++) {
            newArray[i + counter] = array[cost600[i]];
        }
        counter += cost600Counter;
        for (int i = 0; i < cost650Counter; i++) {
            newArray[i + counter] = array[cost650[i]];
        }
        counter += cost650Counter;
        for (int i = 0; i < cost700Counter; i++) {
            newArray[i + counter] = array[cost700[i]];
        }
        counter += cost700Counter;
        for (int i = 0; i < cost750Counter; i++) {
            newArray[i + counter] = array[cost750[i]];
        }
        counter += cost750Counter;
        for (int i = 0; i < cost800Counter; i++) {
            newArray[i + counter] = array[cost800[i]];
        }
        counter += cost800Counter;
        for (int i = 0; i < cost850Counter; i++) {
            newArray[i + counter] = array[cost850[i]];
        }
        counter += cost850Counter;
        for (int i = 0; i < cost900Counter; i++) {
            newArray[i + counter] = array[cost900[i]];
        }
        counter += cost900Counter;
        for (int i = 0; i < cost950Counter; i++) {
            newArray[i + counter] = array[cost950[i]];
        }
        counter += cost950Counter;
        for (int i = 0; i < cost1000Counter; i++) {
            newArray[i + counter] = array[cost1000[i]];
        }
        counter += cost1000Counter;
        for (int i = 0; i < cost1050Counter; i++) {
            newArray[i + counter] = array[cost1050[i]];
        }
        counter += cost1050Counter;
        for (int i = 0; i < cost1100Counter; i++) {
            newArray[i + counter] = array[cost1100[i]];
        }
        counter += cost1100Counter;
        for (int i = 0; i < cost1150Counter; i++) {
            newArray[i + counter] = array[cost1150[i]];
        }
        counter += cost1150Counter;
        for (int i = 0; i < cost1200Counter; i++) {
            newArray[i + counter] = array[cost1200[i]];
        }
        counter += cost1200Counter;
        for (int i = 0; i < cost1250Counter; i++) {
            newArray[i + counter] = array[cost1250[i]];
        }
        counter += cost1250Counter;
        for (int i = 0; i < cost1300Counter; i++) {
            newArray[i + counter] = array[cost1300[i]];
        }
        counter += cost1300Counter;
        for (int i = 0; i < cost1350Counter; i++) {
            newArray[i + counter] = array[cost1350[i]];
        }
        counter += cost1350Counter;
        for (int i = 0; i < cost1400Counter; i++) {
            newArray[i + counter] = array[cost1400[i]];
        }
        counter += cost1400Counter;
        for (int i = 0; i < cost1450Counter; i++) {
            newArray[i + counter] = array[cost1450[i]];
        }
        counter += cost1450Counter;
        for (int i = 0; i < cost1500Counter; i++) {
            newArray[i + counter] = array[cost1500[i]];
        }
        counter += cost1500Counter;
        for (int i = 0; i < cost1550Counter; i++) {
            newArray[i + counter] = array[cost1550[i]];
        }
        counter += cost1550Counter;
        for (int i = 0; i < cost1600Counter; i++) {
            newArray[i + counter] = array[cost1600[i]];
        }
        counter += cost1600Counter;
        for (int i = 0; i < cost1650Counter; i++) {
            newArray[i + counter] = array[cost1650[i]];
        }
        counter += cost1650Counter;
        for (int i = 0; i < cost1700Counter; i++) {
            newArray[i + counter] = array[cost1700[i]];
        }
        counter += cost1700Counter;
        for (int i = 0; i < cost1750Counter; i++) {
            newArray[i + counter] = array[cost1750[i]];
        }
        counter += cost1750Counter;
        for (int i = 0; i < cost1800Counter; i++) {
            newArray[i + counter] = array[cost1800[i]];
        }
        counter += cost1800Counter;
        for (int i = 0; i < cost1850Counter; i++) {
            newArray[i + counter] = array[cost1850[i]];
        }
        counter += cost1850Counter;
        for (int i = 0; i < cost1900Counter; i++) {
            newArray[i + counter] = array[cost1900[i]];
        }
        counter += cost1900Counter;
        for (int i = 0; i < cost1950Counter; i++) {
            newArray[i + counter] = array[cost1950[i]];
        }
        counter += cost1950Counter;
        for (int i = 0; i < cost2000Counter; i++) {
            newArray[i + counter] = array[cost2000[i]];
        }

        return newArray;
    }
}
