package salaryemulator.util;

import org.springframework.stereotype.Service;

@Service
public class PrinterFactory {
    public static Printer getPrinter() {
        return new Printer();
    }
}
