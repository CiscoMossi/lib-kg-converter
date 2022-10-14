package dev.ifrs.service;

public class ConverterService {
    public static final double CONVERSION_VALUE = 0.453592;

    public double convertLibToKg(double libValue) {
        return libValue * CONVERSION_VALUE;
    }

    public double convertKgToLib(double kgValue) {
        return kgValue / CONVERSION_VALUE;
    }
}