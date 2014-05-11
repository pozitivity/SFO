INSERT INTO rubric(rubric_name) VALUES
('Спорт/Отдых/Туризм'),('Транспорт/Грузоперевозки'),
('Строительство/Недвижимость/Ремонт'),('Досуг/Развлечения/Общественное питание'),
('Медицина/Здоровье/Красота'),('Строительные/отделочные материалы'),
('Автосервис/Автотовары'),('Юридические/финансовые/бизнес-услуги'),('Торговые комплексы/Спецмагазины'),
('Оборудование/Инструмент'),('Образование/Работа/Карьера'),('Реклама/Полиграфия/СМИ'),
('Интернет/Информационные технологии'),('Мебель/Материалы/Фурнитура'),('Одежда/Обувь'),('Компьютеры/Бытовая техника'),
('Коммунальные/бытовые/ритуальные услуги'),('Электроника/Электротехника'),
('Продукты питания/Напитки'),('Металлы/Топливо/Химия'),('Город/Власть'),
('Культура/Искусство/Религия'),('Хозтовары/Канцелярия/Упаковка'),
('Охрана/Безопасность'),('Текстиль/Предметы интерьера'),('Товары для животных/Ветеринария'),
('Аварийные/справочные/экстренные службы');

/* add subrubric for rubric 'Спорт/Отдых/Туризм' */
INSERT INTO rubric(main_rubric_id, rubric_name)  
SELECT rubric_id, 'Авиационные клубы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Авто-/картинг-/мотоцентры' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Базы отдыха' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Бассейны' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Велнес-залы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Велосипеды' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Водно-спортивный транспорт/техника' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Военно-патриотические клубы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Гольф клубы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Гостиницы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Детские лагеря' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Детское игровое оборудование' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Квартирные бюро' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Конные клубы/ипподромы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Круизы/Морские, речные прогулки' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Ледовые дворцы, катки' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Лыжные базы, горнолыжные комплексы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Обучение танцам' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Охотничьи принадлежности' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Помощь в оформлении загранпаспортов' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Прокат спортивного инвентаря' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Профессиональные спортивные клубы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Ремонт спортивного инвентаря' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Рыболовные/ Охотничьи центры' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Рыболовные принадлежности' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Сквош-клубы/корты' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Снаряжение для туризма и отдыха' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Спортивная одежда/обувь' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Спортивно-интелектуальные клубы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Спортивно-наградная продукция' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Спортивно-развлекательное оборудование' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Спортивное питание' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Спортивные секции' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Спортивные школы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Спортивный инвентарь' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Стадионы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Товары для конного спорта' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Товары для подводного плавания' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Туристические агентства' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Туроператоры' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Федерации спорта' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Фитнес-клубы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Хостелы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Центры йоги' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм' UNION ALL
SELECT rubric_id, 'Яхт-клубы' FROM rubric WHERE rubric_name='Спорт/Отдых/Туризм';

/* add subrubribcs for rubric 'Транспорт/Грузоперевозки' */
INSERT INTO rubric(main_rubric_id, rubric_name)
SELECT rubric_id, 'Авиабилеты' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Авиагрузоперевозки' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Авиакомпании' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Авиаоборудование' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Автобусные билеты' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Автовокзалы/Автостанции' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Автомобилестроение' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Автоэкспертиза' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Аэропорты' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Бронированные автомобили' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Вывоз мусора/снега' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Гаражные кооперативы' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Заказ автобусов' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Заказ пассажирского авиатранспорта' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Заказ пассажирского легкового транспорта' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Заказ спецтехники' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Коллективные автостоянки' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Контейнеры для грузоперевозок' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Междугородние/Международные пассажирские перевозки' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Международные грузоперевозки' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Международные автогрузоперевозки' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Метрополитен' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Морские грузоперевозки' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Морские порты' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Морской вокзал' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Мототехника' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Оформление купли-продажи автомобилей' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Продажа автобусов' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Продажа легковых автомобилей' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Продажа грузовых автомобилей' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Проездные билеты' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Прокат автотранспорта' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Прокат водно-спортивного транспорта' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Речной вокзал' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Сельхозтехника' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Судостроение' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Трамвайные депо' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Троллейбусные депо' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Услуги водителя без автомобиля' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Услуги грузчиков' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Услуги складского хранения' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Экспедирование грузов' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки' UNION ALL
SELECT rubric_id, 'Экспресс-почта' FROM rubric WHERE rubric_name='Транспорт/Грузоперевозки';

/* add subrubribcs for rubric 'Строительство/Недвижимость/Ремонт' */
INSERT INTO rubric(main_rubric_id, rubric_name)
SELECT rubric_id, 'Автоматизация инженерных систем' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Агентства недвижимости' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Антикоррозийная обработка металлоконструкций' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Аренда помещений' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Архитектурно-строительное проектирование' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Бизнес-центры' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Буровые работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Быстровозводимые здания' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Взрывные работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Высотные работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Геозедические работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Геологические работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Геофизичесике работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Гидромассажное оборудование' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Гидротехническое строительство' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Деревообработка' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Дизайн интерьеров' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Жилищное строительство' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Земельно-кадастровые работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Изготовление макетов' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Инжиниринговые услуги' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Конференц-залы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Кровельные работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Ландшафтная архитектура' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Монтаж и ремонт внутренних систем отопления/водоснабжения' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Монтаж климатических систем' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Новостройки' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Оборудование для очистки воды' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Остекленение балконов' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Подводно-технические работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Продажа/аренда недвижимости за рубежом' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Продажа земельных участков' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Проектирование дорог/мостов' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Проектирование инженерных систем' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Промышленное строительство' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Реконструкция и капремонт зданий' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Ремонт/отделка помещений' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Ремонт/укладка напольных покрытий' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Ремонт окон' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Репетиционные студии' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Реставрация ванн' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Сантехника/Санфаянс' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Свайные работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Сварочные работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Сервисное обслуживание бассейнов' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Системы отопления/водоснабжения' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Снос зданий' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Согласование перепланировок' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство/обслуживание электросетей' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство/ремонт дорог' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство/ремонт наружных инженерных сетей' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство административных зданий' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство бань/саун' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство гаражей' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство дач/коттеджей' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство и монтаж бассейнов/фонтанов' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство и обслуживание АЭС/ГЭС/ТЭЦ' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство мостов/путепроводов/метрополитена' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство систем газоснабжения' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Строительство спортивных сооружений' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Теплоизоляционные работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Техническая инвентаризация/учет' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Техническая экспертиза зданий' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Тонирование стекол зданий' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Услуги по устройству промышленных полов' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Фасадные работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Экологические работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Экоизмерительные работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт' UNION ALL
SELECT rubric_id, 'Электромонтажные работы' FROM rubric WHERE rubric_name='Строительство/Недвижимость/Ремонт';


/* add subrubribcs for rubric 'Досуг/Развлечения/Общественное питание' */
INSERT INTO rubric(main_rubric_id, rubric_name)
SELECT rubric_id, 'Аквапарки/Водные аттракционы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Антикафе' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Бани/Сауны' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Банкетные залы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Бары' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Бильярдные залы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Ботанический сад' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Боулинг' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Букмекерские конторы/Лотереи' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Дайвинг-центры/Дельфинарий' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Детские/подростковые клубы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Детские игровые залы/игротеки' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Дома/дворцы культуры' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Доставка готовых блюд' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Зоопарк' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Караоке-залы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Кафе' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Кафе/рестораны быстрого питания' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Кафе-кондитерские/кофейни' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Кейтеринг' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Киноаттракционы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Кинотеатры' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Комбинаты питания' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Концертные залы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Культурно-досуговые центры для взрослых' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Ночные клубы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Океанариум' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Организация и проведение праздников' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Организация театральных/концертных мероприятий' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Организация экскурсий по городу' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Парк бабочек' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Парки культуры и отдыха' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Пляжи' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Продажа билетов на развлекательные мероприятия' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Рестораны' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Рюмочные' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Салюты' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Спортивно-тактические клубы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Столовые' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Стрелковые клубы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Суши-бары/рестораны' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Творческие коллективы' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Услуги праздничного оформления' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Услуги фото/видеосъемки на выезде' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Фреш-бары/Точки безалкогольных коктейлей/горячих напитков' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание' UNION ALL
SELECT rubric_id, 'Цирк' FROM rubric WHERE rubric_name='Досуг/Развлечения/Общественное питание';

/* add subrubribcs for rubric 'Медицина/Здоровье/Красота' */
INSERT INTO rubric(main_rubric_id, rubric_name)
SELECT rubric_id, 'SPA-процедуры' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Аптеки' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Банки стволовых клеток' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Биологически активны добавки' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Больницы' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Бюро медико-социальной экспертизы' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Врачебные амбулатории' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Галотерапия' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Гирудотерапия' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Госпитали' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Диабетологические центры' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Диагностические центры' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Диспансеры' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Женские консультации' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Зуботехничесике лаборатории' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Изготовление/продажа париков' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Коррекция веса' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Коррекция зрения' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Косметика/Парфюмерия' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Кометика/расходные материалы для салонов красоты' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Косметика ручной работы' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Косметические услуги' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Лабораторные реактивы' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Лекарственные препараты' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Лечение ЛОР-заболеваний' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Мануальная терапия' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Массажное оборудование/приборы' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Медикаментозное лечение зависимостей' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Медико-санитарные части' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Медицинские комиссии' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Медицинские лаборатории' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Медицинские приборы/аппараты' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Медицинские расходные материалы' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Медицинское оборудование/инструмент' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Многопрофильные медицинские центры' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Морги' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Ногтевые студии' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Оптика' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Ортопедия и травматология' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Очищение организма' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Парикмахерские' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Патронажные услуги' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Пластическая хирургия' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Поликлиники взрослые' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Поликлиники детские' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Протезные/ортопедические товары' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Психиатрические учреждения' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Психологическая помощь в избавлении от зависимостей' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Реабилитационные центры' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Ремонт медицинского оборудования' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Рефлексотерапия' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Родильные дома' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Санатории/профилактории' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Санитарно-эпидемиологический надзор' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Средства гигиены' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Станции переливания крови' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Стоматологичсекие поликлиники' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Стоматологические центры' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Стоматологическое оборудование' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Студии загара' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Сырье для лекарственных средств' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Тату-салоны' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Тонизирующие процедуры' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Травмпункты' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги аллерголога/иммунолога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги визажиста' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги врача-гомеопата' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги гастроэнтеролога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги гинеколога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги дерматовенеролога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги детских специалистов' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги имидж-консультанта' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги кардиолога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги логопеда' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги маммолога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги массажиста' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги невролога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги онколога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги по организации лечения за рубежом' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги проктолога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги психолога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги пульмонолога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги росписи по телу' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги трихолога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги уролога/андролога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги флеболога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги хирурга' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Услуги эндокринолога' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Фельдшерско-акушерские пункты' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Физиотерапия' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Фитопродукция' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Хоспис' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Центры альтернативной медицины' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Центры борьбы со СПИДом' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Центры планирования семьи' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота' UNION ALL
SELECT rubric_id, 'Школы для будущих мам' FROM rubric WHERE rubric_name='Медицина/Здоровье/Красота';



/* add subrubribcs for rubric 'Строительные/отделочные материалы' */
INSERT INTO rubric(main_rubric_id, rubric_name)
SELECT rubric_id, 'Автоматические ворота/двери' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Бетон/раствор' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Вторичные строительные материалы' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Входные двери' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Герметики/клеи' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Гидроизоляционные материалы' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Гипсокартон/комплектующие' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Грязепоглощяющие покрытия' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'ДСП/ДВП/Фанера' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Декоративные элементы/покрытия' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Железобетонные изделия' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Заборы/ограждения' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Замки/скобяные изделия' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Звукоизоляционные материалы' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Изготовление художественных витражей/мозаики' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Керамическая плитка/кафель' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Керамогранит' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Кирпич' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Комплектующие для дверей' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Комплектующие для окон' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Крепежные изделия' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Кровельные материалы' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Лакокрасочные материалы' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Магазины отделочных материалов' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Магазины строительных материалов' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, 'Материалы для дорожного строительства' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Строительные/отделочные материалы' UNION ALL



/* add subrubribcs for rubric 'Автосервис/Автотовары' */
INSERT INTO rubric(main_rubric_id, rubric_name)
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Автосервис/Автотовары' UNION ALL
/* add subrubribcs for rubric 'Юридические услуги' */
INSERT INTO rubric(main_rubric_id, rubric_name)
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Юридические услуги' UNION ALL
/* add subrubribcs for rubric 'Финансовые услуги' */
INSERT INTO rubric(main_rubric_id, rubric_name)
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Финансовые услуги' UNION ALL
/* add subrubribcs for rubric 'Бизнес услуги' */
INSERT INTO rubric(main_rubric_id, rubric_name)
SELECT rubric_id, '' FROM rubric WHERE rubric_name='Бизнес услуги' UNION ALL