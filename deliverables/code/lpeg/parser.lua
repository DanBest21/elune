local lpeg = require("lpeg")
local inspect = require("inspect")

--[[ Tokens ]]
-- TODO: Tidy up tokens when more is known about precedence (when defining the parser)
-- Comments
local comment_token = lpeg.P("//")
local multiline_comment_start_token = lpeg.P("/*")
local multiline_comment_end_token = lpeg.P("*/")

-- Control and Whitespace Characters
local white_token = lpeg.S(" ") ^ 0
local indent_token = lpeg.S("\t")
local newline_token = lpeg.S("\r\n")

-- Keywords
local global_token = white_token * lpeg.P("global")
local while_token = white_token * lpeg.P("while")
local do_token = white_token * lpeg.P("do")
local for_token = white_token * lpeg.P("for")
local if_token = white_token * lpeg.P("if")
local else_token = white_token * lpeg.P("else")
local switch_token = white_token * lpeg.P("switch")
local try_token = white_token * lpeg.P("try")
local catch_token = white_token * lpeg.P("catch")
local and_token = white_token * lpeg.P("and")
local or_token = white_token * lpeg.P("or")
local is_token = white_token * lpeg.P("is")
local not_token = white_token * lpeg.P("not")
local in_token = white_token * lpeg.P("in")
local break_token = white_token * lpeg.P("break")
local continue_token = white_token * lpeg.P("continue")
local len_token = white_token * lpeg.P("len")
local return_token = white_token * lpeg.P("return")
local import_token = white_token * lpeg.P("import")

-- Boolean
local boolean_type_token = lpeg.P("boolean")
local boolean_token = lpeg.P("true") + lpeg.P("false")

-- Int
local int_type_token = lpeg.P("int")
local int_token = lpeg.R("09") ^ 1 / tonumber

-- Float
local float_type_token = lpeg.P("float")
local float_token = int_token * lpeg.P(".") * int_token

-- Null
local null_token = lpeg.P("null")

-- String
local string_type_token = lpeg.P("string")
local string_token = lpeg.R("az", "AZ")

-- Function
local function_type_token = lpeg.P("function")
-- TODO: Figure out what other tokens are needed for function declaration and definition

-- Var (Lua Table)
local var_type_token = lpeg.P("var")
-- TODO: Figure out what other tokens are needed for table definition, access and manipulation

-- General Operators
local equals_token = lpeg.P("=")
local underscore_token = lpeg.P("_")

-- Comparison Operators
local is_equal_token = equals_token * equals_token
local not_equal_token = lpeg.P("!") * equals_token
local less_than_token = lpeg.P("<")
local greater_than_token = lpeg.P(">")
local less_than_or_equal_to_token = less_than_token * equals_token
local greater_than_or_equal_to_token = greater_than_token * equals_token

-- Numeric Operators
local add_token = lpeg.P("+")
local minus_token = lpeg.P("-")
local multiply_token = lpeg.P("*")
local divide_token = lpeg.P("/")
local modulo_token = lpeg.P("%")
local exponent_token = lpeg.P("^")

local add_assignment_token = add_token * equals_token
local minus_assignment_token = minus_token * equals_token
local multiply_assignment_token = multiply_token * equals_token
local divide_assignment_token = divide_token * equals_token
local modulo_assignment_token = modulo_token * equals_token
local exponent_assignment_token = exponent_token * equals_token

-- String Operators
local concat_token = lpeg.P("++")

-- [[ Parser ]]
local function node(p)
    return p / function(left, op, right)
        return { op, left, right }
    end
end

local parser = lpeg.P({
    "expressions",
    expressions = lpeg.V("expressions") + lpeg.V("expression") * -1,
    expression = lpeg.V("assignment"),
    assignment = lpeg.V("type") * string_token * equals_token * 
})