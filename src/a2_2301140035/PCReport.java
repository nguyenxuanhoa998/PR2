package a2_2301140035;


public class PCReport {
    public PCReport(){
    }
    public String displayReport(PC [] objs){
        StringBuilder report = new StringBuilder();

        // Tạo dòng separator (dành cho Java 8 trở lên)
        String separator = new String(new char[99]).replace("\0", "-") + "\n";

        // Header
        report.append(separator);
        report.append(String.format("%" + ((99 - " PCPROG REPORT ".length()) / 2 + " PCPROG REPORT ".length()) + "s\n",
                " PCPROG REPORT "));
        report.append(separator);

        // Data Rows
        for (int i = 0; i < objs.length; i++) {
            PC pc = objs[i];

            report.append(i > 99 ? ".." : String.format("%2d", i + 1)).append(" ");

            // Model
            String model = pc.getModel();
            report.append(String.format("%20s", model.length() > 20 ? model.substring(0, 17) + "..." : model)).append(" ");

            // Year
            report.append(String.format("%7d", pc.getYear())).append(" ");

            // Manufacturer
            report.append(String.format("%15s", pc.getManufacturer())).append(" ");

            // Components
            Set<String> compSet = pc.getComps();
            String comps = compSet.stream().reduce("[", (acc, str) -> acc.length() > 1 ? acc + ", " + str : acc + str) + "]";

            if (comps.length() > 50) {
                comps = comps.substring(0, 47) + "...]";
            }

            report.append(String.format("%-51s", comps)).append("\n");
        }

        report.append(separator);
        return report.toString();
    }
}
