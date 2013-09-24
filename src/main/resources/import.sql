--Subscription table insert
insert into subscription(id, email) values(1,"test10@mail.ru");

--Event table insert
insert into event(name, description, date, eye, img) values("Противостояние Нептуна ","lalalaf НЕПТУН вступает в противостояние с Солнцем 27 августа, поэтому в этом месяце виден всю ночь, и это самый благоприятный период для его наблюдений. Планета перемещается попятно по созвездию Водолея в виде тусклой звезды +7,8m звездной величины с угловым диаметром около 2. Дистанция между Землей и Нептуном придерживается значения 29,0 а.е. Найти Нептун поможет бинокль или телескоп при помощи звездных карт и ясное прозрачное небо. Чтобы рассмотреть диск планеты, нужен 200-мм телескоп с увеличением от 100 крат и выше. Спутники Нептуна имеют блеск слабее +13m.",1377622800000,1,"1event.jpg");
insert into event(name, description, date, eye, img) values("Новолуние","Освещенность: 1%. Луна в созвездии Лев. Расстояние до Луны - 391 731км. Фаза новой луны (новолуние) наступает, когда Солнце, Луна и Земля выстраиваются в одну линию. В этой фазе наш спутник не виден ночью, потому что он восходит и заходит вместе с Солнцем. Непосредственно Луна при новолунии, как правило, не видна, однако спустя несколько часов после или до новолуния при очень ясной атмосфере иногда всё-таки можно заметить слабо освещённый диск, отраженный от Земли пепельный свет Луны. Обнаружить наличие Луны на небе можно также по тому, какие звёзды заслонены («покрытие звёзд» Луной). Следует отметить, что Луна при новолунии никогда не будет видна на фоне ночного неба (исключение составляет только случай Солнечного затмения, когда неосвещённая Луна видна на фоне Солнечного диска). Интервал между новолуниями составляет в среднем 29,530589 суток",1378400400000,0,"4event.jpg");
insert into event(name, description, date, eye, img) values("Полнолуние lalala","Освещенность: 100%. Луна в созвездии Водолей. Расстояние до Луны - 366 746км. Фаза полной Луны (полнолуние) наступает, когда Солнце, Земля и Луна в соответствующей последовательности выстраиваются в одну лини и Луна полностью освещена Солнцем. Мы полностью видим лунный диск, потому что Луна восходит с заходом Солнца.",1377104400000,0,"2event.jpg");
insert into event(name, description, date, eye, img) values("Метеорный поток каппа-Цигниды","LalalaРадиант метеорного потока каппа-Цигниды в определенной степени стационарный, благодаря его близости к эклиптическому северному полюсу, и находится в созвездии Лебедя. Активность этого потока переменная. Основная часть метеоров медленная, и при этом не слишком яркая. Тем не менее в состав каппа-Цигнид включаются и крупные образования, которые порождают яркие болиды. А значит, их можно и наблюдать визуально невооруженным глазом, и через телескоп, и запечатлеть в свой фото- или видео-архив. Многие астрономы предполагают, что активность этого метеорного потока меняется периодически, есть сообщения о возможном периоде в 6.6 лет.Однако в 2013 году вблизи максимума потока возможно помешает наблюдению Луна.",1376845200000,1,"3event.jpg");
insert into event(name, description, date, eye, img) values("Звездный дождь Персеид","Традиционно самым запоминающимся явлением второй половины лета становится звездный дождь Персеид. Обычная активность данного потока происходит в период с 17 июля по 24 августа. Персеиды являются едва ли не самым динамичным, стабильным, красивым и сильным ежегодным звездопадом. Максимум приходится на 12-13 августа, когда число метеоров достигает 100-110 в час. Для наблюдения метеорного дождя не нужны никакие астрономические приборы, поэтому насладиться ночным зрелищем может любой желающий.В 2013 году главный пик метеорного потока ожидается 12 августа с 18ч до 21ч по Всемирному времени UT. Вблизи максимума Луна будет перед первой четвертью, что создает хорошие условия для ночных наблюдений. Интенсивность этого дождя меняется год от года и зависит от плотности облака частиц в том участке шлейфа кометы, который пересекает Земля.Наблюдать поток лучше всего вдали от городских огней и не слишком лунной ночью, тогда есть шанс увидеть множество более слабых метеоров. Метеоры вылетают из радианта, который легко определить, нанеся на карту несколько метеоров из потока. Место пересечения продолжения путей метеоров от конца к началу и будет точкой радианта R. При наблюдениях метеорных дождей не обязательно смотреть на саму точку радианта. Лучше всего найти стул с откидной спинкой или шезлонг, чтобы удобнее обозревать все небо.",1376326800000,0,"4event.jpg");

--User table insert
insert into user(username, email, password, role, activationCode, activated) values("tom", "tom@gmail.com", "1234", "ROLE_USER", null, true);
insert into user(username, email, password, role, activationCode, activated) values("jerry", "jerry@gmail.com", "2345", "ROLE_MODERATOR", null, true);
insert into user(username, email, password, role, activationCode, activated) values("admin", "admin@gmail.com", "12345", "ROLE_ADMIN", null, true);
