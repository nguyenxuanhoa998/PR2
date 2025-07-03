package Assignment09;

import java.io.*;

public class Matrix {
    private int rows, cols;
    private double[][] data;

    // Constructor
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    // Save matrix to file
    public void save(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this);
        }
    }

    // Read matrix from file
    public static Matrix read(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Matrix) ois.readObject();
        }
    }

    // Matrix addition
    public Matrix sum(Matrix m) {
        if (this.rows != m.rows || this.cols != m.cols) return null;

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.data[i][j] = this.data[i][j] + m.data[i][j];

        return result;
    }

    // Matrix multiplication
    public Matrix product(Matrix m) {
        if (this.cols != m.rows) return null;

        Matrix result = new Matrix(this.rows, m.cols);
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < m.cols; j++)
                for (int k = 0; k < this.cols; k++)
                    result.data[i][j] += this.data[i][k] * m.data[k][j];

        return result;
    }
}
