  vi.mock("../../contexts/TodoContext", () => {
    return {
      useTodos: vi.fn(),
      useTodosDispatch: vi.fn(),
    };
  });
  useTodos.mockImplementation(() => ({ data: dummyTodos, category: "ALL" }));
  useTodosDispatch.mockImplementation(() => (action) => {
    mockObj.dispath(action);
  });
