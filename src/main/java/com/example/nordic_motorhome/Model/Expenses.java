package com.example.nordic_motorhome.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Entity
public class Expenses extends Rental{
    @Id
    private int rental_id;
    private String rental_end_date;
    private String end_time;
    private String drop_off;
    private int drop_off_extras;
    private int km_end;
    private int repair_fee;
    private float fuel_level;
    private double full_price;

    public Expenses(int rental_id, int customer_id, int motorhome_id, String rental_start_date, String start_time, int bike_rack, int bed_linen, int chairs, int picnic_table, int child_seat, int km_start, String season, String pick_up, int pick_up_extra, int rental_id1, String rental_end_date, String end_time, String drop_off, int drop_off_extras, int km_end, int repair_fee, float fuel_level, double full_price) {
        super(rental_id, customer_id, motorhome_id, rental_start_date, start_time, bike_rack, bed_linen, chairs, picnic_table, child_seat, km_start, season, pick_up, pick_up_extra);
        this.rental_id = rental_id;
        this.rental_end_date = rental_end_date;
        this.end_time = end_time;
        this.drop_off = drop_off;
        this.drop_off_extras = drop_off_extras;
        this.km_end = km_end;
        this.repair_fee = repair_fee;
        this.fuel_level = fuel_level;
        this.full_price = full_price;
    }
    public Expenses(int rental_id, int customer_id, int motorhome_id, String rental_start_date, String start_time, int bike_rack, int bed_linen, int chairs, int picnic_table, int child_seat, String pick_up, int pick_up_extra, int km_start, String season, String rental_end_date, String end_time, String drop_off) {
        super(rental_id, customer_id, motorhome_id, rental_start_date, start_time, bike_rack, bed_linen, chairs, picnic_table, child_seat, km_start, season, pick_up, pick_up_extra);
        this.rental_end_date = rental_end_date;
        this.end_time = end_time;
        this.drop_off = drop_off;

    }

    public Expenses(){

    }

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public String getRental_end_date() {
        return rental_end_date;
    }

    public void setRental_end_date(String rental_end) {
        this.rental_end_date = rental_end;
    }

    public String getDrop_off() {
        return drop_off;
    }

    public void setDrop_off(String drop_off) {
        this.drop_off = drop_off;
    }

    public int getDrop_off_extras() {
        return drop_off_extras;
    }

    public void setDrop_off_extras(int drop_off_extras) {
        this.drop_off_extras = drop_off_extras;
    }

    public int getKm_end() {
        return km_end;
    }

    public void setKm_end(int km_end) {
        this.km_end = km_end;
    }

    public int getRepair_fee() {
        return repair_fee;
    }

    public void setRepair_fee(int repair_fee) {
        this.repair_fee = repair_fee;
    }

    public double getFuel_level() {
        return fuel_level;
    }

    public void setFuel_level(float fuel_level) {
        this.fuel_level = fuel_level;
    }

    public double getFull_price(){
        double x = 0;
        double z = drop_off_extras / 0.7;
        double f = pick_up_extra / 0.7;
        x = x + f + z;

        LocalDate localDate1 = LocalDate.parse(rental_start_date);
        LocalDate localDate2 = LocalDate.parse(rental_end_date);
        long noOfDaysDifference = ChronoUnit.DAYS.between(localDate1, localDate2);

        int kmDif = km_start - km_end;
        int maxKm = (int) (kmDif / noOfDaysDifference);
        if(maxKm > 400) {
            x = x + maxKm - 400;
        }
        x = x + repair_fee;

        if(fuel_level > 0.5) {
            x = x +70;
        }
        if (season == "middle") {
            x = x + 1.30;
        } else if (season == "peak") {
            x = x + 1.6;
        }
        x = full_price;

        return full_price;
    }

    public void setFull_price(double full_price) {
        this.full_price = full_price;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}