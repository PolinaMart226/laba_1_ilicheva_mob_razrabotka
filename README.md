# Лабораторная работа №2. Основа верстки
**Язык программирования**: Java  
**Выполнила**: Ильичева П.Е.

## Задания лабораторной работы 
*Задание 1.* Разработать мобильное приложение, состоящее из четырех activity. 
## Описание приложения
Приложение состоит из четырех Activity.

После запуска приложения пользователь попадает на экран с **Activity1**. На данном экране представлено меню, состоящее из четырех кнопок:
- Высота кнопок составляет 20% от высоты экрана.
- Расстояние между кнопками – 2%.
- Первая и последняя кнопка находятся на равном расстоянии от краев экрана.
- Ширина кнопок составляет 75%, выравнивание – по центру (посередине).
 ![image](https://github.com/user-attachments/assets/58965d91-ac2c-4fd4-95a0-38677623dade)


### Переходы между Activity
1. **Первая кнопка**: При нажатии на первую кнопку пользователь переходит к **Activity2**. Внешний вид этой активности представлен на рисунке.
   - Верстка осуществляется с использованием `LinearLayout`, ширина кнопок задается в процентах от ширины экрана.
    ![image](https://github.com/user-attachments/assets/e90cd7c5-2e44-48dd-a943-4f5ac866dc53)


2. **Вторая кнопка**: Нажатие на вторую кнопку в **Activity1** приводит к переходу к **Activity3**. Внешний вид **Activity3** также представлен на рисунке.
   - Верстка осуществляется с использованием `RelativeLayout` ( не использовать `LinearLayout`)
    ![image](https://github.com/user-attachments/assets/38ea3bda-7a5b-468c-a657-8148c1945007)


3. **Третья кнопка**: Третья кнопка в **Activity1** создает **Activity3**.
   - Внешний вид **Activity3** представлен на рисунке.
   - Кнопка выровнена по центру экрана.
   - Цвет обводки кнопки: `#505050`.
   - Толщина обводки соответствует месяцу вашего рождения (от 1 до 12).
   - Радиус скругления: **24dp**.
   - Цвет фона экрана: `#FFFFFF`.
   - При нажатии на кнопку ее цвет изменяется на светло-зеленый.
    ![image](https://github.com/user-attachments/assets/ee9774a7-d1c5-408e-9417-ce9873d9e021)


https://github.com/user-attachments/assets/e5e7063f-71b7-4922-8ffa-616754e55003


4. **Четвертая кнопка**: Нажатие на четвертую кнопку в **Activity1** приводит к закрытию приложения.



https://github.com/user-attachments/assets/ef0f3efe-efe8-4aaa-988b-a3cdf3661c7e

