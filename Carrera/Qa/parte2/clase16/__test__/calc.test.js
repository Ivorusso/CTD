const { test } = require("picomatch");
const { suma, multiplicacion, division, resta } = require("../calc.js");

describe("Suma dos numeros", () => {
  test("sumaTest", () => {
    const parametros = suma(4, 4);
    expect(parametros).toBe(8);
  }),
    test("sumaTest2", () => {
      const parametros = suma(0, 0);
      expect(parametros).toBe(0);
    }),
    test("sumaTest3", () => {
      const parametros = suma(4, 4);
      expect(parametros).not.toBe(9);
    }),

    test("Verdadero", () => {
      const parametros = suma(2, 2)
      excpect(parametros).toBeTruthy(4)
    });
});



describe("resta dos numeros", () => {
  test("resta", () => {
    const parametros = resta(4, 4);
    expect(parametros).toBe(0);
  }),
    test("resta2", () => {
      const parametros = resta(0, 0);
      expect(parametros).toBe(0);
    }),
    test("resta3", () => {
      const parametros = resta(4, 4);
      expect(parametros).not.toBe(8);
    });
});

describe("multiplicacion dos numeros", () => {
  test("multiplicacion", () => {
    const parametros = multiplicacion(4, 4);
    expect(parametros).toBe(16);
  });

  test("multiplicacion", () => {
    const parametros = multiplicacion(0, 0);
    expect(parametros).toBe(0);
  });

  test("multiplicacion", () => {
    const parametros = multiplicacion(2, 2);
    expect(parametros).not.toBe(8);
  });
});

describe("Division dos numeros", () => {
  test("division", () => {
    const parametros = division(4, 4);
    expect(parametros).toBe(1);
  });
  test("division2", () => {
    const parametros = division(0, 0);
    expect(parametros).not.toBe(null);
  });
  test("division3", () => {
    const parametros = division(20, 5);
    expect(parametros).not.toBe(5);
  });
  test("division4", () => {
    const parametros = division(4, 4);
    expect(parametros).toBe(1);
  });
});
