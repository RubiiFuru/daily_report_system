package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */
//@WebFilter("/*")
public class LoginFilter implements Filter {

    /**
     * Default constructor.
     */
    public LoginFilter() {
    }

    /**
     * @see Filter#destroy()
     */
    public void destroy() {
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

//        String contextPath = ((HttpSevletRequest) request).getContextPath();
//        String servletPath = ((HttpServletRequest) request).getServletPast();
//
//        if (servletPath.matches("/css.*")) {
//            //CSSフォルダ内は認証処理から除外する
           chain.doFilter(request, response);
//
//        } else {
//            HttpSession session = ((HttpServletRequest) request).getSession();
//
//            //クエリパラメータからactionとcommandを取得
//            String action = request.getParameter(ForwardConst.ACT.getValue());
//            String command = request.getParameter(ForwardConst.CMD.getValue());
//
//            //セッションからログインしている従業員の情報を取得
//            EmployeeView ev = (EmployeeView) session.getAttribute(AttributeConst.LOGIN_EMP.getValue());
//
//            if (ev == null) {
//                //未ログイン
//
//                if(!(ForwardConst.ACT_AUTH.getValue().equals(action)
//                        && (ForwardConst.CMD_SHOW_LOGIN.getValue().equals(command)
//                                || ForwardConst.CMD_LOGIN.getValue().equals(command)))) {
//
//                    //ログインページの表示またはログイン実行以外はログインページにリダイレクト
//
//                }
//            }
//        }

    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
    }

}
