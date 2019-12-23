package com.designPatterns.gangOfFour.structual.facade;

// Facade - knows which subsystem classes are responsible for a request.
// Delegates client requests to appropriate subsystem objects.
class Compiler {
	public void compile(InputStream inputStream, BytecodeStream bytecodeStream) {
		// This implementation hard-codes the type of code generator to use so that
		// programmers aren't required to specify the target architecture. That might
		// be reasonable if there's only ever one target architecture. If that's not
		// the case, then we might want to change the Compiler constructor to take a
		// CodeGenerator parameter. Then programmers can specify the generator to use
		// when they instantiate Compiler. The compiler facade can parameterize other
		// participants such as Scanner and ProgramNodeBuilder as well, which adds
		// flexibility, but it also detracts from the Facade pattern's mission, which
		// is to simplify the interface for the common case.
		Scanner scanner = new Scanner(inputStream);
		ProgramNodeBuilder builder = new ProgramNodeBuilder(new ExpressionNode());
		Parser parser = new ParserImpl();
		parser.parse(scanner, builder);
		RISCCodeGenerator generator = new RISCCodeGenerator(bytecodeStream);
		ProgramNode parseTree = builder.getRootNode();
		parseTree.traverse(generator);
	}
}