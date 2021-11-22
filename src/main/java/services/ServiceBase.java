package services;

import javax.persistence.EntityManager;

import utils.DBUtil;

/**
 * DB接続に関わる共通処理を行う
 * 各Serviceクラスのスーパークラス
 */
public class ServiceBase {

    /**
     * EntityManagerインスタンス
     */

    protected EntityManager em = DBUtil.createEntityManager();

    /**
     * EntityManagerのクローズ
     */

    public void close() {
        if (em.isOpen()) {
            em.close();
        }
    }

}
