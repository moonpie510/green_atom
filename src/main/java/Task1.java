// Описание что делал ниже
/**
 * Решил создать реальную базу данных и показать работу с ней.
 * Можно просто запустить код и запрос к базе данных выполнится.
 * Я использовал jdbc драйвер, чтобы законектиться с базой данных PostgreSQL.
 * JDBC драйвер подключил с помощью Maven, но на всякий случай оставил jar библиотеку
 * в проекте под названием "postgresql-42.6.0.jar".
 * База данных размещена на хостинге Clever Cloud.
 * SQL запрос выглядит так:
 *
 * SELECT surname FROM green_atom.workers
 * WHERE experience = (SELECT MAX(experience) FROM green_atom.workers
 * WHERE experience < (SELECT MAX(experience) FROM green_atom.workers))
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task1 {
    private static final String url = "jdbc:postgresql://bqp1lelf3gdxeih3whb0-postgresql.services.clever-cloud.com:5432/bqp1lelf3gdxeih3whb0";
    private static final String username = "uurvow6qltil4wjceyyd";
    private static final String password = "MDMN2WAErXIyXuPryGRC4zzMZKC5qm";

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();

            // Запрос на показ всех данных из таблицы
            ResultSet result = st.executeQuery("SELECT * FROM green_atom.workers");

            System.out.println("Подключение к базе данных успешно" + "\n" + "Ниже показана база данных" + "\n");
            System.out.println("id" + "\t" + "surname" + "\t" + "experience");

            while (result.next()) {
                System.out.println(result.getInt("id") + "\t" + result.getString("surname") + "\t" + result.getInt("experience"));
            }

            // Запрос на нахождение сотрудника со вторым максимальным опытом
            result = st.executeQuery("SELECT surname FROM green_atom.workers\n" +
                    "WHERE experience = (SELECT MAX(experience) FROM green_atom.workers\n" +
                    "WHERE experience < (SELECT MAX(experience) FROM green_atom.workers))");

            System.out.print("\nФамилия сотрудника со вторым максимальным опытом работы - ");

            while (result.next()) {
                System.out.println(result.getString("surname"));
            }

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
