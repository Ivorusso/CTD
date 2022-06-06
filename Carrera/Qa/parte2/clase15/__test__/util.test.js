const { generateText } = require("../util.js");

test("output", () => {
  const parametros = generateText("Ivo", 19);
  expect(parametros).toBe("Ivo (19 years old)");
});
